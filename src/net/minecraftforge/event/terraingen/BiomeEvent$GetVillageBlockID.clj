(ns net.minecraftforge.event.terraingen.BiomeEvent$GetVillageBlockID
  "This event is fired when the village generator attempts to choose a block ID
  based on the village's biome.

  You can cancel the event to override default values"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen BiomeEvent$GetVillageBlockID]))

(defn ->get-village-block-id
  "Constructor.

  biome - `net.minecraft.world.biome.Biome`
  original - `net.minecraft.block.state.IBlockState`"
  (^BiomeEvent$GetVillageBlockID [^net.minecraft.world.biome.Biome biome ^net.minecraft.block.state.IBlockState original]
    (new BiomeEvent$GetVillageBlockID biome original)))

(defn get-original
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BiomeEvent$GetVillageBlockID this]
    (-> this (.getOriginal))))

(defn get-replacement
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BiomeEvent$GetVillageBlockID this]
    (-> this (.getReplacement))))

(defn set-replacement
  "replacement - `net.minecraft.block.state.IBlockState`"
  ([^BiomeEvent$GetVillageBlockID this ^net.minecraft.block.state.IBlockState replacement]
    (-> this (.setReplacement replacement))))

