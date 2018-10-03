# library-example-lab-cy

    /*****************************************************************
     * Carlton Segbefia, Zhao Yuanqi                                 *
     * PO Box: 4439,                                                 *
     * Program for CSC 207                                           *
     *   Library example lab                                         *
     * Assignment for Wednesday, October 3rd                         *
     *****************************************************************/


    /* ***************************************************************
     * Academic honesty certification:                               *
     *   Written/online sources used:                                *
     *     None                                                      *
     *   Help obtained                                               *
     *     John Gouwar                                               *
     *   My signature below confirms that the above list of sources  *
     *   is complete AND that I have not talked to anyone else       *
     *   [e.g., CSC 161 students] about the solution to this problem *
     *                                                               *
     *   Signature: Carlton Segbefia            Zhao Yuanqi          *
     *****************************************************************/
     
**Testing**

-Test Plan identifes full range of circumstances that can arise in problem
  -Printing out books via toString
  -Comparing books 
  -Checking out books
  -returning books 
  -creating book

-Listing of all test specifc cases with values to be used and expected outcome(s)
  1. Add some books
  2. Print out books 
  3. Compare books
  4. test whether a checked out book could checked out again
  5. test whether an already returned book could be returned

-Runs conducted and identifed for all identifed cases
  1 & 2. were tested via professor walker's Library class code which we later modified given us 
         results similar to his results and fit our expectations
  3. CompareTo() was run on books before, after and equal to each other and expected results were given 
  4. Checkout() was run on the same book twice and the appropriate prompt was printed 
  5. return() was run on the same book twice and the appropriate prompt was printed 

-Comments given regarding program correctness
  The program passed all tests vis the Library Class by outputting the expected results and as such we 
  belive our progran is correct
