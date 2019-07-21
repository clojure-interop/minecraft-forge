(ns net.minecraftforge.client.model.IPerspectiveAwareModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model IPerspectiveAwareModel]))

(defn handle-perspective
  "camera-transform-type - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType`

  returns: `org.apache.commons.lang3.tuple.Pair<? extends net.minecraft.client.renderer.block.model.IBakedModel,javax.vecmath.Matrix4f>`"
  ([^IPerspectiveAwareModel this ^net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType camera-transform-type]
    (-> this (.handlePerspective camera-transform-type))))

