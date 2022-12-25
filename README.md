# debruijn

[![GitHub license](https://img.shields.io/github/license/reednel/debruijn)](https://github.com/reednel/debruijn/blob/main/LICENCE) [![repo size](https://img.shields.io/github/repo-size/reednel/debruijn)](https://github.com/reednel/debruijn) [![paper](https://img.shields.io/badge/paper-pdf-blueviolet)](https://github.com/reednel/debruijn/blob/paper/main.pdf)

This repository consists mainly of 3 parts:

## 1. Code (src/)

### 1a. Main.java

The Main class holds the driver from which the other code is run, as well as some basic functions relating to de Bruijn sequences.

### 1b. DBGraph.java

The DBGraph class contains several methods of note. generate() constructs an adjacency matric for a given k and n. printEulerian() and writeEulerian() recursively traverse the constructed adjacency matrix, and return all valid de Bruijn sequences as they are identified, the difference is in the method of output.

### 1c. Shuffle.java

The Shuffle class houses methods which manipulate the positions of characters within individual sequences (rotating, shuffling), and methods to perform checks on many sequences with the end of discovering patterns and unveiling new properties.

## 2. Data (db_sets/)

This folder holds text files containing up to 1 MB worth of B(k, n) sequences for select values of k and n. These files were generated by the printEulerian() method, which is contained in the DBGraph.java file.

## 3. Paper

This paper explains basic properties of de Bruijn sequences and graphs, discovered for or with the utilities in this repository.

## License

This repository is licensed under the [MIT](https://opensource.org/licenses/MIT) licence.
