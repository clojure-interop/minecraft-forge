(ns net.minecraft.client.renderer.block.model.multipart.ICondition
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model.multipart ICondition]))

(defn get-predicate
  "block-state - `net.minecraft.block.state.BlockStateContainer`

  returns: `com.google.common.base.Predicate<net.minecraft.block.state.IBlockState>`"
  (^com.google.common.base.Predicate [^ICondition this ^net.minecraft.block.state.BlockStateContainer block-state]
    (-> this (.getPredicate block-state))))

