/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    
    let n=nums.filter((v)=>{
     
      return v!=val;
    })
    nums.length=0;
    nums.push(...n);
    return n.length;
};