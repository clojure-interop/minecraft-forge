(ns net.minecraftforge.common.property.IExtendedBlockState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.property IExtendedBlockState]))

(defn get-unlisted-names
  "returns: `java.util.Collection<net.minecraftforge.common.property.IUnlistedProperty<?>>`"
  (^java.util.Collection [^IExtendedBlockState this]
    (-> this (.getUnlistedNames))))

(defn get-value
  "property - `net.minecraftforge.common.property.IUnlistedProperty`

  returns: `<V> V`"
  ([^IExtendedBlockState this ^net.minecraftforge.common.property.IUnlistedProperty property]
    (-> this (.getValue property))))

(defn with-property
  "property - `net.minecraftforge.common.property.IUnlistedProperty`
  value - `V`

  returns: `<V> net.minecraftforge.common.property.IExtendedBlockState`"
  ([^IExtendedBlockState this ^net.minecraftforge.common.property.IUnlistedProperty property value]
    (-> this (.withProperty property value))))

(defn get-unlisted-properties
  "returns: `com.google.common.collect.ImmutableMap<net.minecraftforge.common.property.IUnlistedProperty<?>,com.google.common.base.Optional<?>>`"
  (^com.google.common.collect.ImmutableMap [^IExtendedBlockState this]
    (-> this (.getUnlistedProperties))))

(defn get-clean
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^IExtendedBlockState this]
    (-> this (.getClean))))

