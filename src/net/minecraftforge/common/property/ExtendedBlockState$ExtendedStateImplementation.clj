(ns net.minecraftforge.common.property.ExtendedBlockState$ExtendedStateImplementation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.property ExtendedBlockState$ExtendedStateImplementation]))

(defn with-property
  "property - `net.minecraft.block.properties.IProperty`
  value - `V`

  returns: `<T extends java.lang.Comparable<T>,V extends T> net.minecraft.block.state.IBlockState`"
  ([^ExtendedBlockState$ExtendedStateImplementation this ^net.minecraft.block.properties.IProperty property value]
    (-> this (.withProperty property value))))

(defn get-unlisted-names
  "returns: `java.util.Collection<net.minecraftforge.common.property.IUnlistedProperty<?>>`"
  (^java.util.Collection [^ExtendedBlockState$ExtendedStateImplementation this]
    (-> this (.getUnlistedNames))))

(defn get-value
  "property - `net.minecraftforge.common.property.IUnlistedProperty`

  returns: `<V> V`"
  ([^ExtendedBlockState$ExtendedStateImplementation this ^net.minecraftforge.common.property.IUnlistedProperty property]
    (-> this (.getValue property))))

(defn get-unlisted-properties
  "returns: `com.google.common.collect.ImmutableMap<net.minecraftforge.common.property.IUnlistedProperty<?>,com.google.common.base.Optional<?>>`"
  (^com.google.common.collect.ImmutableMap [^ExtendedBlockState$ExtendedStateImplementation this]
    (-> this (.getUnlistedProperties))))

(defn build-property-value-table
  "map - `java.util.Map`"
  ([^ExtendedBlockState$ExtendedStateImplementation this ^java.util.Map map]
    (-> this (.buildPropertyValueTable map))))

(defn get-clean
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^ExtendedBlockState$ExtendedStateImplementation this]
    (-> this (.getClean))))

