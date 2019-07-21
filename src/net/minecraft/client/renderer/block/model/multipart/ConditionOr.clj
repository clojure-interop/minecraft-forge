(ns net.minecraft.client.renderer.block.model.multipart.ConditionOr
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model.multipart ConditionOr]))

(defn ->condition-or
  "Constructor.

  conditions-in - `java.lang.Iterable`"
  (^ConditionOr [^java.lang.Iterable conditions-in]
    (new ConditionOr conditions-in)))

(defn get-predicate
  "block-state - `net.minecraft.block.state.BlockStateContainer`

  returns: `com.google.common.base.Predicate<net.minecraft.block.state.IBlockState>`"
  (^com.google.common.base.Predicate [^ConditionOr this ^net.minecraft.block.state.BlockStateContainer block-state]
    (-> this (.getPredicate block-state))))

