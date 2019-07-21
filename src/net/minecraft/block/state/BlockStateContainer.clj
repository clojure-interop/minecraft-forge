(ns net.minecraft.block.state.BlockStateContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state BlockStateContainer]))

(defn ->block-state-container
  "Constructor.

  block-in - `net.minecraft.block.Block`
  properties - `net.minecraft.block.properties.IProperty`"
  (^BlockStateContainer [^net.minecraft.block.Block block-in ^net.minecraft.block.properties.IProperty properties]
    (new BlockStateContainer block-in properties)))

(defn *validate-property
  "block - `net.minecraft.block.Block`
  property - `net.minecraft.block.properties.IProperty`

  returns: `<T extends java.lang.Comparable<T>> java.lang.String`"
  ([^net.minecraft.block.Block block ^net.minecraft.block.properties.IProperty property]
    (BlockStateContainer/validateProperty block property)))

(defn get-valid-states
  "returns: `com.google.common.collect.ImmutableList<net.minecraft.block.state.IBlockState>`"
  (^com.google.common.collect.ImmutableList [^BlockStateContainer this]
    (-> this (.getValidStates))))

(defn get-base-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockStateContainer this]
    (-> this (.getBaseState))))

(defn get-block
  "returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^BlockStateContainer this]
    (-> this (.getBlock))))

(defn get-properties
  "returns: `java.util.Collection<net.minecraft.block.properties.IProperty<?>>`"
  (^java.util.Collection [^BlockStateContainer this]
    (-> this (.getProperties))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStateContainer this]
    (-> this (.toString))))

(defn get-property
  "property-name - `java.lang.String`

  returns: `net.minecraft.block.properties.IProperty<?>`"
  (^net.minecraft.block.properties.IProperty [^BlockStateContainer this ^java.lang.String property-name]
    (-> this (.getProperty property-name))))

