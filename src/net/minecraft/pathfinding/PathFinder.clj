(ns net.minecraft.pathfinding.PathFinder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding PathFinder]))

(defn ->path-finder
  "Constructor.

  processor - `net.minecraft.pathfinding.NodeProcessor`"
  (^PathFinder [^net.minecraft.pathfinding.NodeProcessor processor]
    (new PathFinder processor)))

(defn find-path
  "world-in - `net.minecraft.world.IBlockAccess`
  p-186333-2 - `net.minecraft.entity.EntityLiving`
  p-186333-3 - `net.minecraft.entity.Entity`
  p-186333-4 - `float`

  returns: `net.minecraft.pathfinding.Path`"
  (^net.minecraft.pathfinding.Path [^PathFinder this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.entity.EntityLiving p-186333-2 ^net.minecraft.entity.Entity p-186333-3 ^Float p-186333-4]
    (-> this (.findPath world-in p-186333-2 p-186333-3 p-186333-4))))

