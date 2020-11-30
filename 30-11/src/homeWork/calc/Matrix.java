package homeWork.calc;



import java.util.Arrays;

public class Matrix extends Var {
    /*
     *  На уровень Cразработайте для класса Varнаследника Matrixс тремя конструкторами:
     *  1. Из массива{ { 1.0, 2.0 },  { 3.0, 4.0 } } сигнатура Matrix(double[ ][ ]  value)
     *  2. Из такой же точно переменной сигнатура Matrix(Matrix matrix)
     *  3. Из строки вида  { { 1.0, 2.0 },  { 3.0, 4.0 } } сигнатура Matrix(String strMatrix)
     *   Переопределите метод String toString()так, чтобы он возвращал строку вида { { 1.0, 2.0 },  { 3.0, 4.0 } }
     */
    private final double[][]value;
    public double[][] getValue() {
        return value;
    }

    public Matrix(double[ ][ ]  value){
        this.value = value;
    }

    public Matrix(Matrix matrix){
        double[][] newMatrix = matrix.value;
        for (int i = 0; i < matrix.value.length; i++) {
            newMatrix[i] = Arrays.copyOf(matrix.value[i], matrix.value[i].length);
        }
        this.value = newMatrix;

    }
    public Matrix(String strMatrix){

        String line = strMatrix.trim();
        line = line.replaceAll("\\s+","");
        line = line.replaceFirst("\\{\\{","");
        line = line.replaceFirst("}}","");
        String[] lineNew = line.split("},\\{");
        String[][] elementNew = new String[lineNew.length][];
        for (int i1 = 0; i1 < lineNew.length; i1++) {
            elementNew[i1] = lineNew[i1].split(",");
        }

        double[][] array = new double[lineNew.length][elementNew[0].length];
            for (int i = 0; i < elementNew.length; i++) {
                for (int j = 0; j < elementNew[0].length; j++) {
                    array[i][j] = Double.parseDouble(elementNew[i][j]);
                }

            }
        this.value = array;

    }



    public String toString(){
        //Переопределите метод String toString()так, чтобы он возвращал строку вида { { 1.0, 2.0 },  { 3.0, 4.0 } }
        StringBuilder out = new StringBuilder();
        out.append("{");
        for (int i = 0; i < value.length ; i++) {
            out.append("{");
            String delimiter="";
            for (int j = 0; j < value[0].length; j++) {
                out.append(delimiter).append(value[i][j]);
                delimiter=",";
            }
            out.append("}");
            if(i< (value.length-1)){out.append(delimiter);}
            }
        out.append("}");
        return out.toString();
    }

    @Override
    public Var add(Var other) throws CalcException {
        if (other instanceof Scalar){
            Scalar otherScalat = (Scalar) other;
            double [][] matrixAdd = new double[this.value.length][this.value[0].length];
            for (int i = 0; i < this.value.length; i++) {
                matrixAdd[i]= Arrays.copyOf(this.value[i],this.value[i].length);
            }
            for (int i = 0; i < matrixAdd.length; i++) {
                for (int j = 0; j < matrixAdd[i].length; j++) {
                    matrixAdd[i][j]+= otherScalat.getValue();
                }
            }
            Matrix result = new Matrix(matrixAdd);
            return result;
        }else if (other instanceof Matrix){
            Matrix otherMatrix = (Matrix) other;
            if(otherMatrix.value.length!= this.value.length||otherMatrix.value[0].length!= this.value[0].length){
                throw new CalcException("not compatible matrix size");
            }
            double [][] matrixAdd = new double[this.value.length][this.value[0].length];
            for (int i = 0; i < this.value.length; i++) {
                matrixAdd[i]= Arrays.copyOf(this.value[i],this.value[i].length);
            }
            for (int i = 0; i < matrixAdd.length; i++) {
                for (int j = 0; j < matrixAdd[i].length; j++) {
                    matrixAdd[i][j]+= otherMatrix.value[i][j];
                }
            }
            Matrix result = new Matrix(matrixAdd);
            return result;
        }
        else return super.add(other);
    }

    @Override
    public Var sub(Var other) throws CalcException {
        if (other instanceof Scalar){
            Scalar otherScalat = (Scalar) other;
            double [][] matrixSub = new double[this.value.length][this.value[0].length];
            for (int i = 0; i < this.value.length; i++) {
                matrixSub[i]= Arrays.copyOf(this.value[i],this.value[i].length);
            }
            for (int i = 0; i < matrixSub.length; i++) {
                for (int j = 0; j < matrixSub[i].length; j++) {
                    matrixSub[i][j]-= otherScalat.getValue();
                }
            }
            Matrix result = new Matrix(matrixSub);
            return result;
        }else if (other instanceof Matrix){
            Matrix otherMatrix = (Matrix) other;
            if(otherMatrix.value.length!= this.value.length||otherMatrix.value[0].length!= this.value[0].length){
                throw new CalcException(ConsoleRunner.manager.get(Message.notCompatibleMatrixSize)+" ");
            }
            double [][] matrixSub = new double[this.value.length][this.value[0].length];
            for (int i = 0; i < this.value.length; i++) {
                matrixSub[i]= Arrays.copyOf(this.value[i],this.value[i].length);
            }
            for (int i = 0; i < matrixSub.length; i++) {
                for (int j = 0; j < matrixSub[i].length; j++) {
                    matrixSub[i][j]-= otherMatrix.value[i][j];
                }
            }
            Matrix result = new Matrix(matrixSub);
            return result;
        }
        else return super.sub(other);
    }

    @Override
    public Var mul(Var other) throws CalcException {
        if (other instanceof Scalar) {
            Scalar otherScalat = (Scalar) other;
            double[][] matrixSub = new double[this.value.length][this.value[0].length];
            for (int i = 0; i < this.value.length; i++) {
                matrixSub[i] = Arrays.copyOf(this.value[i], this.value[i].length);
            }
            for (int i = 0; i < matrixSub.length; i++) {
                for (int j = 0; j < matrixSub[i].length; j++) {
                    matrixSub[i][j] *= otherScalat.getValue();
                }
            }
            Matrix result = new Matrix(matrixSub);
            return result;
        } else if (other instanceof Vector){
            Vector otherVector = (Vector) other;
            if(otherVector.getValue().length!= value[0].length){
                throw new CalcException(ConsoleRunner.manager.get(Message.notCompatibleMatrixOrVectorSize));}
            double[][] matrixMul = new double[this.value.length][this.value[0].length];
            for (int i = 0; i < this.value.length; i++) {
                matrixMul[i] = Arrays.copyOf(this.value[i], this.value[i].length);
            }
            double[] mul = new double[matrixMul.length];
            for (int i = 0; i < matrixMul.length; i++) {
                for (int j = 0; j < otherVector.getValue().length; j++) {
                    mul[i] += matrixMul[i][j] * otherVector.getValue()[j];
                }
            }
            Vector result = new Vector(mul);
            return result;


        }else if (other instanceof Matrix){
            Matrix otherMatrix = (Matrix) other;
            if (otherMatrix.value.length!= value[0].length)
            {throw new CalcException(ConsoleRunner.manager.get(Message.notCompatibleMatrixSize));}
            double [][] matrixMul = new double[this.value.length][this.value[0].length];
            for (int i = 0; i < this.value.length; i++) {
                matrixMul[i]= Arrays.copyOf(this.value[i],this.value[i].length);
            }
            double[][] resMul = new double[matrixMul.length][otherMatrix.value[0].length];
            for (int i = 0; i < matrixMul.length; i++) {
                for (int j = 0; j < otherMatrix.value[0].length; j++) {
                    for (int k = 0; k < otherMatrix.value.length; k++)
                        resMul[i][j] = resMul[i][j] + matrixMul[i][k] * otherMatrix.value[k][j];
                }
            }
            Matrix result = new Matrix(resMul);
            return result;
        }
        else return super.mul(other);
    }

    @Override
    public Var div(Var other) throws CalcException {
        if (other instanceof Scalar) {
            Scalar otherScalar = (Scalar) other;
            if(otherScalar.getValue() == 0) {throw new CalcException(ConsoleRunner.manager.get(Message.divisionByZero));}
            double[][] matrixDiv = new double[this.value.length][this.value[0].length];
            for (int i = 0; i < this.value.length; i++) {
                matrixDiv[i] = Arrays.copyOf(this.value[i], this.value[i].length);
            }
            for (int i = 0; i < matrixDiv.length; i++) {
                for (int j = 0; j < matrixDiv[i].length; j++) {
                    matrixDiv[i][j] /= otherScalar.getValue();
                }
            }
            Matrix result = new Matrix(matrixDiv);
            return result;
        } else return super.div(other);
    }
}

