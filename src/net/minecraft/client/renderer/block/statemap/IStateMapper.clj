(ns net.minecraft.client.renderer.block.statemap.IStateMapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.statemap IStateMapper]))

(defn put-state-model-locations
  "block-in - `net.minecraft.block.Block`

  returns: `java.util.Map<net.minecraft.block.state.IBlockState,net.minecraft.client.renderer.block.model.ModelResourceLocation>`"
  (^java.util.Map [^IStateMapper this ^net.minecraft.block.Block block-in]
    (-> this (.putStateModelLocations block-in))))

