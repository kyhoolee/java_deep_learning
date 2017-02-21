package rnn.model;
import java.io.Serializable;
import java.util.List;

import rnn.autodiff.Graph;
import rnn.matrix.Matrix;


public interface Model extends Serializable {
	Matrix forward(Matrix input, Graph g) throws Exception;
	void resetState();
	List<Matrix> getParameters();
}
