# yeah i'm finally learning R now. 
# Does it spark joy? Not at all. Tell me why they don't have a built-in method
# for finding the mode of a dataset, and then tell me why Modes are an inaccurate measure
# of center. I'll wait.
stat_mode <- function(x){
	table(x) -> counts
	as.numeric(names(counts)[counts == max(counts)]) -> modes
	if (length(modes) > 1) list(modes) 
	else print(modes)
}
# to use: source($ABSOLUTE_PATH/stat_mode.rd)
# then stat_mode(your dataset, playa)
