(ns net.minecraft.pathfinding.PathNavigateSwimmer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding PathNavigateSwimmer]))

(defn ->path-navigate-swimmer
  "Constructor.

  entityliving-in - `net.minecraft.entity.EntityLiving`
  world-in - `net.minecraft.world.World`"
  (^PathNavigateSwimmer [^net.minecraft.entity.EntityLiving entityliving-in ^net.minecraft.world.World world-in]
    (new PathNavigateSwimmer entityliving-in world-in)))

(defn can-entity-stand-on-pos?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^PathNavigateSwimmer this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canEntityStandOnPos pos))))

