#include <cstdlib>

#include <boost/numeric/ublas/matrix.hpp>

int main() {
	matrix<double> matrix (3, 3);

	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			matrix(i, j) = (double)rand() / RAND_MAX;
		}
	}
}
