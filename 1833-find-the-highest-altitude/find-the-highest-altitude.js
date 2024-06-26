/**
 * @param {number[]} gain
 * @return {number}
 */
var largestAltitude = function(gain) {
    if(gain.length==1) {
        if(gain[0]>=0)
        return gain[0];
        else return 0;
    }
    if(gain.length==0) return 0;
   let point=0;
   gain.reduce((curralt,next)=>{
     if(curralt>point) point=curralt;
    curralt=curralt+next;
    if(curralt>point) point=curralt;
      return curralt; 
   }) 
   return point;
};