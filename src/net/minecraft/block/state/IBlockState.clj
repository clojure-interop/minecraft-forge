(ns net.minecraft.block.state.IBlockState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state IBlockState]))

(defn get-property-keys
  "returns: `java.util.Collection<net.minecraft.block.properties.IProperty<?>>`"
  (^java.util.Collection [^IBlockState this]
    (-> this (.getPropertyKeys))))

(defn get-value
  "property - `net.minecraft.block.properties.IProperty`

  returns: `<T extends java.lang.Comparable<T>> T`"
  ([^IBlockState this ^net.minecraft.block.properties.IProperty property]
    (-> this (.getValue property))))

(defn with-property
  "property - `net.minecraft.block.properties.IProperty`
  value - `V`

  returns: `<T extends java.lang.Comparable<T>,V extends T> net.minecraft.block.state.IBlockState`"
  ([^IBlockState this ^net.minecraft.block.properties.IProperty property value]
    (-> this (.withProperty property value))))

(defn cycle-property
  "property - `net.minecraft.block.properties.IProperty`

  returns: `<T extends java.lang.Comparable<T>> net.minecraft.block.state.IBlockState`"
  ([^IBlockState this ^net.minecraft.block.properties.IProperty property]
    (-> this (.cycleProperty property))))

(defn get-properties
  "returns: `com.google.common.collect.ImmutableMap<net.minecraft.block.properties.IProperty<?>,java.lang.Comparable<?>>`"
  (^com.google.common.collect.ImmutableMap [^IBlockState this]
    (-> this (.getProperties))))

(defn get-block
  "returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^IBlockState this]
    (-> this (.getBlock))))

