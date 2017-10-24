require("prime")
arr = []
Prime.each(600851475143) do |prime|
    arr << prime
end

puts arr[arr.length-1]