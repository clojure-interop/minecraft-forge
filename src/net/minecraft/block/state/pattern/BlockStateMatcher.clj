(ns net.minecraft.block.state.pattern.BlockStateMatcher
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state.pattern BlockStateMatcher]))

(def *-any
  "Static Constant.

  type: com.google.common.base.Predicate<net.minecraft.block.state.IBlockState>"
  BlockStateMatcher/ANY)

(defn *for-block
  "block-in - `net.minecraft.block.Block`

  returns: `net.minecraft.block.state.pattern.BlockStateMatcher`"
  (^net.minecraft.block.state.pattern.BlockStateMatcher [^net.minecraft.block.Block block-in]
    (BlockStateMatcher/forBlock block-in)))

(defn apply
  "p-apply-1 - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockStateMatcher this ^net.minecraft.block.state.IBlockState p-apply-1]
    (-> this (.apply p-apply-1))))

(defn where
  "property - `net.minecraft.block.properties.IProperty`
  is - `com.google.common.base.Predicate`

  returns: `<V extends java.lang.Comparable<V>> net.minecraft.block.state.pattern.BlockStateMatcher`"
  ([^BlockStateMatcher this ^net.minecraft.block.properties.IProperty property ^com.google.common.base.Predicate is]
    (-> this (.where property is))))

