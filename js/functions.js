/**
 * Please provide all your functions in this file.
 * Consider using extending built-in objects.
 */
 
"use strict";

// ADD
// For the addition, both of the matrices have to be identical
const result = [];                                // create result matrix
const rowCount = m1.length;                       // number of rows in one of the matrix
const colCount = m1[0].length;                    // number of columns in one of the matrix

for(let row=0; row<rowCount; row++){              // loop over matrix rows.
  result.push([]);                                // create a new row for the result.
  for(let col=0; col<colCount; col++){            // loop over matrix columns.
     result[result.length-1]                      
       .push(m1[row][col] + m2[row][col]);        // Add numbers in the same position and put them in result in same position
  } 
}

console.log(result);


// ADD
// Alternative way
function addLines(pLine1, pLine2){
  return pLine1.map((cell, index) => cell + pLine2[index]);
}
function addMatrices(pMatrix1, pMatrix2){
    return pMatrix1.map((line, index) => addLines(line, pMatrix2[index]));  
}

console.log(addMatrices(m1, m2));



// MULTIPLY
//The number of columns of the 1st matrix must equal the number of rows of the 2nd matrix.
//And the result will have the same number of rows as the 1st matrix, and the same number of columns as the 2nd matrix.

const result = [];                                // create result matrix
const rowCount = m1.length;                       // number of rows in one of the matrix
const colCount = m2[0].length;                    // number of columns in one of the matrix

// check

function getColumn(pMatrix, pCol){
  return pMatrix.reduce((acc, value, index)=>{ 
    acc.push(value[pCol]);
    return acc;
  }, [])
}

function multiplyLines(pRow, pCol){
  return pRow.map((value, index) => value * pCol[index])
      .reduce((acc, value) => acc + value, 0);
}

for (let row = 0; row < rowCount; row++) {
  result.push([]);
  for (let col = 0; col < colCount; col++) {
    result[row][col]= multiplyLines(m1[row], getColumn(m2, col));
  }
}

console.log(result);