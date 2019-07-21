(ns net.minecraft.block.state.pattern.BlockMatcher
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state.pattern BlockMatcher]))

(defn *for-block
  "block-type - `net.minecraft.block.Block`

  returns: `net.minecraft.block.state.pattern.BlockMatcher`"
  (^net.minecraft.block.state.pattern.BlockMatcher [^net.minecraft.block.Block block-type]
    (BlockMatcher/forBlock block-type)))

(defn apply
  "p-apply-1 - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockMatcher this ^net.minecraft.block.state.IBlockState p-apply-1]
    (-> this (.apply p-apply-1))))

