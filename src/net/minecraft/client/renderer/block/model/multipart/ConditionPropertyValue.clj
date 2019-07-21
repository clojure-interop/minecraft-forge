(ns net.minecraft.client.renderer.block.model.multipart.ConditionPropertyValue
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model.multipart ConditionPropertyValue]))

(defn ->condition-property-value
  "Constructor.

  key-in - `java.lang.String`
  value-in - `java.lang.String`"
  (^ConditionPropertyValue [^java.lang.String key-in ^java.lang.String value-in]
    (new ConditionPropertyValue key-in value-in)))

(defn get-predicate
  "block-state - `net.minecraft.block.state.BlockStateContainer`

  returns: `com.google.common.base.Predicate<net.minecraft.block.state.IBlockState>`"
  (^com.google.common.base.Predicate [^ConditionPropertyValue this ^net.minecraft.block.state.BlockStateContainer block-state]
    (-> this (.getPredicate block-state))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConditionPropertyValue this]
    (-> this (.toString))))

