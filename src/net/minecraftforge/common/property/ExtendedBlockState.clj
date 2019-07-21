(ns net.minecraftforge.common.property.ExtendedBlockState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.property ExtendedBlockState]))

(defn ->extended-block-state
  "Constructor.

  block-in - `net.minecraft.block.Block`
  properties - `net.minecraft.block.properties.IProperty[]`
  unlisted-properties - `net.minecraftforge.common.property.IUnlistedProperty[]`"
  (^ExtendedBlockState [^net.minecraft.block.Block block-in properties unlisted-properties]
    (new ExtendedBlockState block-in properties unlisted-properties)))

(defn get-unlisted-properties
  "returns: `java.util.Collection<net.minecraftforge.common.property.IUnlistedProperty<?>>`"
  (^java.util.Collection [^ExtendedBlockState this]
    (-> this (.getUnlistedProperties))))

