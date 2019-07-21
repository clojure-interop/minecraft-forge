(ns net.minecraft.client.renderer.block.statemap.BlockStateMapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.statemap BlockStateMapper]))

(defn ->block-state-mapper
  "Constructor."
  (^BlockStateMapper []
    (new BlockStateMapper )))

(defn register-block-state-mapper
  "block-in - `net.minecraft.block.Block`
  state-mapper - `net.minecraft.client.renderer.block.statemap.IStateMapper`"
  ([^BlockStateMapper this ^net.minecraft.block.Block block-in ^net.minecraft.client.renderer.block.statemap.IStateMapper state-mapper]
    (-> this (.registerBlockStateMapper block-in state-mapper))))

(defn register-built-in-blocks
  "block-in - `net.minecraft.block.Block`"
  ([^BlockStateMapper this ^net.minecraft.block.Block block-in]
    (-> this (.registerBuiltInBlocks block-in))))

(defn put-all-state-model-locations
  "returns: `java.util.Map<net.minecraft.block.state.IBlockState,net.minecraft.client.renderer.block.model.ModelResourceLocation>`"
  (^java.util.Map [^BlockStateMapper this]
    (-> this (.putAllStateModelLocations))))

(defn get-blockstate-locations
  "block-in - `net.minecraft.block.Block`

  returns: `java.util.Set<net.minecraft.util.ResourceLocation>`"
  (^java.util.Set [^BlockStateMapper this ^net.minecraft.block.Block block-in]
    (-> this (.getBlockstateLocations block-in))))

(defn get-variants
  "block-in - `net.minecraft.block.Block`

  returns: `java.util.Map<net.minecraft.block.state.IBlockState,net.minecraft.client.renderer.block.model.ModelResourceLocation>`"
  (^java.util.Map [^BlockStateMapper this ^net.minecraft.block.Block block-in]
    (-> this (.getVariants block-in))))

