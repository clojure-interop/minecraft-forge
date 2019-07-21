(ns net.minecraft.entity.EntityBodyHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityBodyHelper]))

(defn ->entity-body-helper
  "Constructor.

  living-in - `net.minecraft.entity.EntityLivingBase`"
  (^EntityBodyHelper [^net.minecraft.entity.EntityLivingBase living-in]
    (new EntityBodyHelper living-in)))

(defn update-render-angles
  ""
  ([^EntityBodyHelper this]
    (-> this (.updateRenderAngles))))

