name: Check LeetCode Screenshot Proof

on:
  pull_request:
    types: [opened, edited, reopened, synchronize]

screenshot:
    runs-on: ubuntu-latest
    steps:
    - name: Check LeetCode Screenshot Proof
      id: screenshot
      uses: actions/checkout@v2
      with:
        ref: ${{ github.event.pull_request.head.sha }}
    - run: |
        screenshots=$(find . -name '*.png' -or -name '*.jpg' -or -name '*.jpeg')
        if [ -z "$screenshots" ]; then
          echo "LeetCode screenshot not found."
          exit 1
        fi

## Check

- [ ] I have given the PR an appropriate name

## Checklist

Please ensure that you have completed the following items before submitting this pull request:

- [ ] I have followed the correct file naming convention? (e.g. smart.go, smart-sol2.js)
- [ ] I have attached the LeetCode screenshot proof to this PR?

## Screenshots

[Please attach any relevant screenshots or images if applicable.]

## Testing

[Please provide a brief description of any testing you have done to verify your changes.]

## Additional Notes

[Please provide any additional context or notes regarding this pull request.]
