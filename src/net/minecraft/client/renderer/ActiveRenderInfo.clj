(ns net.minecraft.client.renderer.ActiveRenderInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer ActiveRenderInfo]))

(defn ->active-render-info
  "Constructor."
  (^ActiveRenderInfo []
    (new ActiveRenderInfo )))

(defn *update-render-info
  "entityplayer-in - `net.minecraft.entity.player.EntityPlayer`
  p-74583-1 - `boolean`"
  ([^net.minecraft.entity.player.EntityPlayer entityplayer-in ^Boolean p-74583-1]
    (ActiveRenderInfo/updateRenderInfo entityplayer-in p-74583-1)))

(defn *project-view-from-entity
  "entity-in - `net.minecraft.entity.Entity`
  p-178806-1 - `double`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^net.minecraft.entity.Entity entity-in ^Double p-178806-1]
    (ActiveRenderInfo/projectViewFromEntity entity-in p-178806-1)))

(defn *get-block-state-at-entity-viewpoint
  "world-in - `net.minecraft.world.World`
  entity-in - `net.minecraft.entity.Entity`
  p-186703-2 - `float`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^net.minecraft.world.World world-in ^net.minecraft.entity.Entity entity-in ^Float p-186703-2]
    (ActiveRenderInfo/getBlockStateAtEntityViewpoint world-in entity-in p-186703-2)))

(defn *get-rotation-x
  "returns: `float`"
  (^Float []
    (ActiveRenderInfo/getRotationX )))

(defn *get-rotation-xz
  "returns: `float`"
  (^Float []
    (ActiveRenderInfo/getRotationXZ )))

(defn *get-rotation-z
  "returns: `float`"
  (^Float []
    (ActiveRenderInfo/getRotationZ )))

(defn *get-rotation-yz
  "returns: `float`"
  (^Float []
    (ActiveRenderInfo/getRotationYZ )))

(defn *get-rotation-xy
  "returns: `float`"
  (^Float []
    (ActiveRenderInfo/getRotationXY )))

