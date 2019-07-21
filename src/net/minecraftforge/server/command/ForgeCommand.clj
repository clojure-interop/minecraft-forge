(ns net.minecraftforge.server.command.ForgeCommand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.command ForgeCommand]))

(defn ->forge-command
  "Constructor."
  (^ForgeCommand []
    (new ForgeCommand )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ForgeCommand this]
    (-> this (.getName))))

(defn get-usage
  "icommandsender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^ForgeCommand this ^net.minecraft.command.ICommandSender icommandsender]
    (-> this (.getUsage icommandsender))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^ForgeCommand this]
    (-> this (.getRequiredPermissionLevel))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^ForgeCommand this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

