import XCTest
import Foundation
@testable import Base
 
class Evaluate: UMBaseTestCase {
    var taxCalculator:TaxCalculator!
    override func setUp() {
        super.setUp()
        taxCalculator = TaxCalculator()
    }
 
    func testGetTaxAmount() {
        XCTAssertEqual(try! taxCalculator.getTaxAmount(salary:100,taxPercentage:38), 38,"Fails for [100, 38]")
        XCTAssertEqual(try! taxCalculator.getTaxAmount(salary:130000,taxPercentage:36), 46800,"Fails for [130000, 36]")
    }
    
    func testNegativeSalary() {
        XCTAssertThrowsError(try taxCalculator.getTaxAmount(salary:-10,taxPercentage:10),"You should throw IllegalArgumentError")
    }
 
    func testNegativeTaxPercentage() {
        XCTAssertThrowsError(try taxCalculator.getTaxAmount(salary:10000,taxPercentage:-10),"You should throw IllegalArgumentError")
    }
 
    func testLargePercentage() {
        XCTAssertThrowsError(try taxCalculator.getTaxAmount(salary:1000,taxPercentage:101),"You should throw IllegalArgumentError")
    }
}
 