package com.example.betterprogression;

/**
 * Main plugin class.
 * 
 * @author Zaur
 * @version 0.1.0
 */
public class BetterProgression {

    private static BetterProgression instance;
    
    /**
     * Constructor - Called when plugin is loaded.
     */
    public BetterProgression() {
        instance = this;
        System.out.println("[TemplatePlugin] Plugin loaded!");
    }
    
    /**
     * Called when plugin is enabled.
     */
    public void onEnable() {
        System.out.println("[TemplatePlugin] Plugin enabled!");
        
        // TODO: Initialize your plugin here
        // - Load configuration
        // - Register event listeners
        // - Register commands
        // - Start services
    }
    
    /**
     * Called when plugin is disabled.
     */
    public void onDisable() {
        System.out.println("[TemplatePlugin] Plugin disabled!");
        
        // TODO: Cleanup your plugin here
        // - Save data
        // - Stop services
        // - Close connections
    }
    
    /**
     * Get plugin instance.
     */
    public static BetterProgression getInstance() {
        return instance;
    }
}
