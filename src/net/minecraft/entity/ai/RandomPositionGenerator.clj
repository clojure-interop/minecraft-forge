(ns net.minecraft.entity.ai.RandomPositionGenerator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai RandomPositionGenerator]))

(defn ->random-position-generator
  "Constructor."
  (^RandomPositionGenerator []
    (new RandomPositionGenerator )))

(defn *find-random-target
  "entitycreature-in - `net.minecraft.entity.EntityCreature`
  xz - `int`
  y - `int`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^net.minecraft.entity.EntityCreature entitycreature-in ^Integer xz ^Integer y]
    (RandomPositionGenerator/findRandomTarget entitycreature-in xz y)))

(defn *get-land-pos
  "p-191377-0 - `net.minecraft.entity.EntityCreature`
  p-191377-1 - `int`
  p-191377-2 - `int`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^net.minecraft.entity.EntityCreature p-191377-0 ^Integer p-191377-1 ^Integer p-191377-2]
    (RandomPositionGenerator/getLandPos p-191377-0 p-191377-1 p-191377-2)))

(defn *find-random-target-block-towards
  "entitycreature-in - `net.minecraft.entity.EntityCreature`
  xz - `int`
  y - `int`
  target-vec-3 - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^net.minecraft.entity.EntityCreature entitycreature-in ^Integer xz ^Integer y ^net.minecraft.util.math.Vec3d target-vec-3]
    (RandomPositionGenerator/findRandomTargetBlockTowards entitycreature-in xz y target-vec-3)))

(defn *find-random-target-block-away-from
  "entitycreature-in - `net.minecraft.entity.EntityCreature`
  xz - `int`
  y - `int`
  target-vec-3 - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^net.minecraft.entity.EntityCreature entitycreature-in ^Integer xz ^Integer y ^net.minecraft.util.math.Vec3d target-vec-3]
    (RandomPositionGenerator/findRandomTargetBlockAwayFrom entitycreature-in xz y target-vec-3)))

