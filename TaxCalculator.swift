enum TaxCalculatorError: Error {
    case IllegalArgumentError
}
 
class TaxCalculator {
    func getTaxAmount(salary:Int, taxPercentage:Int) throws -> Int {
        if (salary < 0 || taxPercentage < 0 || taxPercentage > 100) {
            throw TaxCalculatorError.IllegalArgumentError
        }
        return salary * taxPercentage / 100;
    }
}