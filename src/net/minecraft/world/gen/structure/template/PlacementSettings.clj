(ns net.minecraft.world.gen.structure.template.PlacementSettings
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure.template PlacementSettings]))

(defn ->placement-settings
  "Constructor."
  (^PlacementSettings []
    (new PlacementSettings )))

(defn set-bounding-box
  "bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `net.minecraft.world.gen.structure.template.PlacementSettings`"
  (^net.minecraft.world.gen.structure.template.PlacementSettings [^PlacementSettings this ^net.minecraft.world.gen.structure.StructureBoundingBox bounding-box-in]
    (-> this (.setBoundingBox bounding-box-in))))

(defn set-replaced-block
  "replaced-block-in - `net.minecraft.block.Block`

  returns: `net.minecraft.world.gen.structure.template.PlacementSettings`"
  (^net.minecraft.world.gen.structure.template.PlacementSettings [^PlacementSettings this ^net.minecraft.block.Block replaced-block-in]
    (-> this (.setReplacedBlock replaced-block-in))))

(defn copy
  "returns: `net.minecraft.world.gen.structure.template.PlacementSettings`"
  (^net.minecraft.world.gen.structure.template.PlacementSettings [^PlacementSettings this]
    (-> this (.copy))))

(defn get-integrity
  "returns: `float`"
  (^Float [^PlacementSettings this]
    (-> this (.getIntegrity))))

(defn set-ignore-structure-block
  "ignore-structure-block-in - `boolean`

  returns: `net.minecraft.world.gen.structure.template.PlacementSettings`"
  (^net.minecraft.world.gen.structure.template.PlacementSettings [^PlacementSettings this ^Boolean ignore-structure-block-in]
    (-> this (.setIgnoreStructureBlock ignore-structure-block-in))))

(defn get-random
  "p-189947-1 - `net.minecraft.util.math.BlockPos`

  returns: `java.util.Random`"
  (^java.util.Random [^PlacementSettings this ^net.minecraft.util.math.BlockPos p-189947-1]
    (-> this (.getRandom p-189947-1))))

(defn set-seed
  "seed-in - `java.lang.Long`

  returns: `net.minecraft.world.gen.structure.template.PlacementSettings`"
  (^net.minecraft.world.gen.structure.template.PlacementSettings [^PlacementSettings this ^java.lang.Long seed-in]
    (-> this (.setSeed seed-in))))

(defn set-mirror
  "mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.world.gen.structure.template.PlacementSettings`"
  (^net.minecraft.world.gen.structure.template.PlacementSettings [^PlacementSettings this ^net.minecraft.util.Mirror mirror-in]
    (-> this (.setMirror mirror-in))))

(defn get-ignore-entities?
  "returns: `boolean`"
  (^Boolean [^PlacementSettings this]
    (-> this (.getIgnoreEntities))))

(defn get-replaced-block
  "returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^PlacementSettings this]
    (-> this (.getReplacedBlock))))

(defn set-integrity
  "integrity-in - `float`

  returns: `net.minecraft.world.gen.structure.template.PlacementSettings`"
  (^net.minecraft.world.gen.structure.template.PlacementSettings [^PlacementSettings this ^Float integrity-in]
    (-> this (.setIntegrity integrity-in))))

(defn set-rotation
  "rotation-in - `net.minecraft.util.Rotation`

  returns: `net.minecraft.world.gen.structure.template.PlacementSettings`"
  (^net.minecraft.world.gen.structure.template.PlacementSettings [^PlacementSettings this ^net.minecraft.util.Rotation rotation-in]
    (-> this (.setRotation rotation-in))))

(defn set-random
  "random-in - `java.util.Random`

  returns: `net.minecraft.world.gen.structure.template.PlacementSettings`"
  (^net.minecraft.world.gen.structure.template.PlacementSettings [^PlacementSettings this ^java.util.Random random-in]
    (-> this (.setRandom random-in))))

(defn get-mirror
  "returns: `net.minecraft.util.Mirror`"
  (^net.minecraft.util.Mirror [^PlacementSettings this]
    (-> this (.getMirror))))

(defn get-rotation
  "returns: `net.minecraft.util.Rotation`"
  (^net.minecraft.util.Rotation [^PlacementSettings this]
    (-> this (.getRotation))))

(defn set-ignore-entities
  "ignore-entities-in - `boolean`

  returns: `net.minecraft.world.gen.structure.template.PlacementSettings`"
  (^net.minecraft.world.gen.structure.template.PlacementSettings [^PlacementSettings this ^Boolean ignore-entities-in]
    (-> this (.setIgnoreEntities ignore-entities-in))))

(defn set-chunk
  "chunk-pos-in - `net.minecraft.util.math.ChunkPos`

  returns: `net.minecraft.world.gen.structure.template.PlacementSettings`"
  (^net.minecraft.world.gen.structure.template.PlacementSettings [^PlacementSettings this ^net.minecraft.util.math.ChunkPos chunk-pos-in]
    (-> this (.setChunk chunk-pos-in))))

(defn get-bounding-box
  "returns: `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^net.minecraft.world.gen.structure.StructureBoundingBox [^PlacementSettings this]
    (-> this (.getBoundingBox))))

(defn get-ignore-structure-block?
  "returns: `boolean`"
  (^Boolean [^PlacementSettings this]
    (-> this (.getIgnoreStructureBlock))))

