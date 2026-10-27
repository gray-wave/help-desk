# yeah i'm finally learning R now. 
stat_mode <- function(x){
	table(x) -> counts
	as.numeric(names(counts)[counts == max(counts)]) -> modes
	if (length(modes) > 1) list(modes) 
	else print(modes)
}
# to use: source($ABSOLUTE_PATH/stat_mode.rd)
# then stat_mode(your dataset)
