import * as d3 from 'd3';

export function circle(sel, color) {
  return sel
    .append("circle")
    .attr("cx", "100px")
    .attr("cy", "100px")
    .attr("r",  "100px")
    .attr("fill", color);
}
