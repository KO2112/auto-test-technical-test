package stepdefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import matrix.Matrix;
import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.*;


public class MetricStepdef {
    private Matrix matrix1;
    private Matrix matrix2;
    private Matrix resultMatrix;

    @Given("I have two {int} and {int} metrices with ONLY positive integers")
    public void i_have_two_matrices_with_positive_integers(int rows, int cols) {
        matrix1 = Matrix.random(rows, cols);
        matrix2 = Matrix.random(rows, cols);
    }

    @When("I add two matrices together")
    public void i_add_two_matrices_together() {
        resultMatrix = matrix1.plus(matrix2);
//        System.out.println((Arrays.deepToString(matrix1.getData())));
//        System.out.println(Arrays.deepToString(matrix2.getData()));
//        System.out.println(Arrays.deepToString(resultMatrix.getData()));

    }

    @Then("result should be correct with summed up values")
    public void result_should_be_correct_with_summed_up_values() {
        Matrix expectedMatrix = matrix1.plus(matrix2);
        assertEquals(expectedMatrix, resultMatrix);

    }

    @Given("I have two {int} and {int} metrices with ONLY negative integers")
    public void iHaveTwoAndMetricesWithNegativeIntegers(int rows, int cols) {
        // JAVA DOESN'T GIVE US NEGATIVE NUMBERS WHEN USING RANDOM SO WE HAVE TO DECLARE OURSELVES
        Random random = new Random();
        double[][] data = new double[rows][cols];
        double[][] data1 = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = -1 * random.nextInt(100);
                data1[i][j] = -1 * random.nextInt(100);
            }
        }
        matrix1 = new Matrix(data);
        matrix2 = new Matrix(data1);
    }




    @Given("I have two {int} and {int} metrices with different dimensons")
    public void iHaveTwoAndMetricesWithDifferentDimensons(int rows, int cols) {
        matrix1 = Matrix.random(2, 3);
        matrix2 = Matrix.random(3, 2);

    }


    @When("I add these two together and it should fail")
    public void iAddTheseTwoTogether() {
        try {
            Matrix expectedMatrix = matrix1.plus(matrix2);
            fail("Test case should have failed due to matrices having different dimensions");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Given("I have two {int} and {int} metrices with negative and positive integers")
    public void iHaveTwoAndMetricesWithNegativeAndPositiveIntegers(int rows, int cols) {
        Random random = new Random();
        double[][] data = new double[rows][cols];
        double[][] data1 = new double[rows][cols];
        // IT DOESN'T GIVE NEGATIVE VALUES FOR ALL THE ARRAYS BUT I SHOULD GET AT LEAST 1 NEGATIVE AT ALL TIMES
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = random.nextInt(201) - 100;
                data1[i][j] = random.nextInt(201) - 100;
            }
        }
        matrix1 = new Matrix(data);
        matrix2 = new Matrix(data1);
    }

    @Then("I add these two together and it should fail with given error")
    public void iAddTheseTwoTogetherAndItShouldFailWithGivenError() {
        try {
            Matrix expectedMatrix = matrix1.plus(matrix2);
            fail("Number of rows and columns must be greater than 0");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}
