(ns net.minecraftforge.event.terraingen.OreGenEvent
  "OreGenEvent is fired when an event involving ore generation occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  world contains the world this event is occurring in.
  rand contains an instance of random that can be used in this event.
  pos contains the coordinates of the chunk position currently being populated with ores.

  All children of this event are fired on the MinecraftForge.ORE_GEN_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen OreGenEvent]))

(defn ->ore-gen-event
  "Constructor.

  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  (^OreGenEvent [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (new OreGenEvent world rand pos)))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^OreGenEvent this]
    (-> this (.getWorld))))

(defn get-rand
  "returns: `java.util.Random`"
  (^java.util.Random [^OreGenEvent this]
    (-> this (.getRand))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^OreGenEvent this]
    (-> this (.getPos))))

