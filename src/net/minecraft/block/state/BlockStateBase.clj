(ns net.minecraft.block.state.BlockStateBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state BlockStateBase]))

(defn ->block-state-base
  "Constructor."
  (^BlockStateBase []
    (new BlockStateBase )))

(defn cycle-property
  "property - `net.minecraft.block.properties.IProperty`

  returns: `<T extends java.lang.Comparable<T>> net.minecraft.block.state.IBlockState`"
  ([^BlockStateBase this ^net.minecraft.block.properties.IProperty property]
    (-> this (.cycleProperty property))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStateBase this]
    (-> this (.toString))))

(defn get-property-value-table
  "returns: `com.google.common.collect.ImmutableTable<net.minecraft.block.properties.IProperty<?>,java.lang.Comparable<?>,net.minecraft.block.state.IBlockState>`"
  (^com.google.common.collect.ImmutableTable [^BlockStateBase this]
    (-> this (.getPropertyValueTable))))

