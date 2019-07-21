(ns net.minecraft.client.renderer.block.model.multipart.ConditionAnd
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model.multipart ConditionAnd]))

(defn ->condition-and
  "Constructor.

  conditions-in - `java.lang.Iterable`"
  (^ConditionAnd [^java.lang.Iterable conditions-in]
    (new ConditionAnd conditions-in)))

(defn get-predicate
  "block-state - `net.minecraft.block.state.BlockStateContainer`

  returns: `com.google.common.base.Predicate<net.minecraft.block.state.IBlockState>`"
  (^com.google.common.base.Predicate [^ConditionAnd this ^net.minecraft.block.state.BlockStateContainer block-state]
    (-> this (.getPredicate block-state))))

