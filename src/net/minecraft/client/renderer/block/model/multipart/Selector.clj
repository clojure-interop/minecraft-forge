(ns net.minecraft.client.renderer.block.model.multipart.Selector
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model.multipart Selector]))

(defn ->selector
  "Constructor.

  condition-in - `net.minecraft.client.renderer.block.model.multipart.ICondition`
  variant-list-in - `net.minecraft.client.renderer.block.model.VariantList`"
  (^Selector [^net.minecraft.client.renderer.block.model.multipart.ICondition condition-in ^net.minecraft.client.renderer.block.model.VariantList variant-list-in]
    (new Selector condition-in variant-list-in)))

(defn get-variant-list
  "returns: `net.minecraft.client.renderer.block.model.VariantList`"
  (^net.minecraft.client.renderer.block.model.VariantList [^Selector this]
    (-> this (.getVariantList))))

(defn get-predicate
  "state - `net.minecraft.block.state.BlockStateContainer`

  returns: `com.google.common.base.Predicate<net.minecraft.block.state.IBlockState>`"
  (^com.google.common.base.Predicate [^Selector this ^net.minecraft.block.state.BlockStateContainer state]
    (-> this (.getPredicate state))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Selector this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Selector this]
    (-> this (.hashCode))))

