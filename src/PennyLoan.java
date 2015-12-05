public class PennyLoan 
{
        private int amount ; // Amount of loan in pence
        private int length ; // length of subscription in months
        
        public PennyLoan(int a, int l) {
                amount = a ;
                length = l ;
        }

        /**
        * Calculate the monthly payment in pounds,
        * rounded up to the nearest penny.
        */
        
        public double paymentPerMonth() {
                float r = (float) (amount/100)/ (float) length;
		Math.round(r*100.0)/100.0;
                return r ;
        }
}
