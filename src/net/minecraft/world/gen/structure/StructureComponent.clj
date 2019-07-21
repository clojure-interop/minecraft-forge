(ns net.minecraft.world.gen.structure.StructureComponent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureComponent]))

(defn ->structure-component
  "Constructor."
  (^StructureComponent []
    (new StructureComponent )))

(defn *find-intersecting
  "list-in - `java.util.List`
  boundingbox-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `net.minecraft.world.gen.structure.StructureComponent`"
  (^net.minecraft.world.gen.structure.StructureComponent [^java.util.List list-in ^net.minecraft.world.gen.structure.StructureBoundingBox boundingbox-in]
    (StructureComponent/findIntersecting list-in boundingbox-in)))

(defn get-coord-base-mode
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^StructureComponent this]
    (-> this (.getCoordBaseMode))))

(defn read-structure-base-nbt
  "world-in - `net.minecraft.world.World`
  tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^StructureComponent this ^net.minecraft.world.World world-in ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.readStructureBaseNBT world-in tag-compound))))

(defn offset
  "x - `int`
  y - `int`
  z - `int`"
  ([^StructureComponent this ^Integer x ^Integer y ^Integer z]
    (-> this (.offset x y z))))

(defn create-structure-base-nbt
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^StructureComponent this]
    (-> this (.createStructureBaseNBT))))

(defn set-coord-base-mode
  "facing - `net.minecraft.util.EnumFacing`"
  ([^StructureComponent this ^net.minecraft.util.EnumFacing facing]
    (-> this (.setCoordBaseMode facing))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureComponent this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureComponent this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn get-bounding-box
  "returns: `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^net.minecraft.world.gen.structure.StructureBoundingBox [^StructureComponent this]
    (-> this (.getBoundingBox))))

(defn get-component-type
  "returns: `int`"
  (^Integer [^StructureComponent this]
    (-> this (.getComponentType))))

