(ns net.minecraft.client.renderer.ItemMeshDefinition
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer ItemMeshDefinition]))

(defn get-model-location
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.client.renderer.block.model.ModelResourceLocation`"
  (^net.minecraft.client.renderer.block.model.ModelResourceLocation [^ItemMeshDefinition this ^net.minecraft.item.ItemStack stack]
    (-> this (.getModelLocation stack))))

