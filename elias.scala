object Solution {
    def isPalindrome(s: String): Boolean = {
        var er = s.toLowerCase.toCharArray.filter(_.isLetterOrDigit).map(_.toString)

        er match {
            case er if (er.length == 1) => return true
            case _ => {
                var er1 = er.fold("") {
                (a, er2) => er2 + a
                }

                er1 == er1.reverse
            }
        }
    }
}
