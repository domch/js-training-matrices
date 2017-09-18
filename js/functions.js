/**
 * Please provide all your functions in this file.
 * Consider using extending built-in objects.
 */
 
"use strict";


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


// Alternatve way to add
function addLines(pLine1, pLine2){
  return pLine1.map((cell, index) => cell + pLine2[index]);
}
function addMatrices(pMatrix1, pMatrix2){
    return pMatrix1.map((line, index) => addLines(line, pMatrix2[index]));  
}

console.log(addMatrices(m1, m2));

