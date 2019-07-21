(ns net.minecraft.client.renderer.block.statemap.StateMapperBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.statemap StateMapperBase]))

(defn ->state-mapper-base
  "Constructor."
  (^StateMapperBase []
    (new StateMapperBase )))

(defn get-property-string
  "values - `java.util.Map`

  returns: `java.lang.String`"
  (^java.lang.String [^StateMapperBase this ^java.util.Map values]
    (-> this (.getPropertyString values))))

(defn put-state-model-locations
  "block-in - `net.minecraft.block.Block`

  returns: `java.util.Map<net.minecraft.block.state.IBlockState,net.minecraft.client.renderer.block.model.ModelResourceLocation>`"
  (^java.util.Map [^StateMapperBase this ^net.minecraft.block.Block block-in]
    (-> this (.putStateModelLocations block-in))))

