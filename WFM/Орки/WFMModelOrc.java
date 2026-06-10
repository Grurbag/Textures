package .minecraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * WFMModelOrc - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class WFMModelOrc extends ModelBase {
    public ModelRenderer field_78114_d;
    public ModelRenderer field_78112_f;
    public ModelRenderer field_78124_i;
    public ModelRenderer field_78116_c;
    public ModelRenderer field_78115_e;
    public ModelRenderer field_78113_g;
    public ModelRenderer field_78123_h;
    public ModelRenderer field_78121_j;
    public ModelRenderer field_78112_fChild;
    public ModelRenderer field_78112_fChild_1;
    public ModelRenderer field_78116_cChild;
    public ModelRenderer field_78116_cChild_1;
    public ModelRenderer field_78116_cChild_2;
    public ModelRenderer field_78113_gChild;
    public ModelRenderer field_78113_gChild_1;

    public WFMModelOrc() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78116_cChild = new ModelRenderer(this, 60, 2);
        this.field_78116_cChild.mirror = true;
        this.field_78116_cChild.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.field_78116_cChild.addBox(-3.5F, -3.0F, -9.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(field_78116_cChild, 0.2617993950843811F, 0.0F, 0.0F);
        this.field_78116_c = new ModelRenderer(this, 0, 0);
        this.field_78116_c.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.field_78116_c.addBox(-5.0F, -8.0F, -7.0F, 10, 10, 10, 0.0F);
        this.field_78113_gChild = new ModelRenderer(this, 36, 13);
        this.field_78113_gChild.mirror = true;
        this.field_78113_gChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78113_gChild.addBox(-3.5F, -2.9000000953674316F, -3.5F, 7, 7, 7, 0.0F);
        this.field_78113_g = new ModelRenderer(this, 20, 50);
        this.field_78113_g.mirror = true;
        this.field_78113_g.setRotationPoint(8.5F, -6.0F, 0.0F);
        this.field_78113_g.addBox(-1.0F, -2.0F, -3.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(field_78113_g, 0.0F, 0.0F, -0.10000000149011613F);
        this.field_78112_fChild_1 = new ModelRenderer(this, 36, 13);
        this.field_78112_fChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78112_fChild_1.addBox(-3.5F, -2.9000000953674316F, -3.5F, 7, 7, 7, 0.0F);
        this.field_78116_cChild_1 = new ModelRenderer(this, 40, 5);
        this.field_78116_cChild_1.mirror = true;
        this.field_78116_cChild_1.setRotationPoint(-1.0F, -1.5F, 0.0F);
        this.field_78116_cChild_1.addBox(-4.0F, -1.0F, -9.0F, 10, 3, 2, 0.0F);
        this.setRotateAngle(field_78116_cChild_1, 0.2617993950843811F, 0.0F, 0.0F);
        this.field_78116_cChild_2 = new ModelRenderer(this, 60, 2);
        this.field_78116_cChild_2.mirror = true;
        this.field_78116_cChild_2.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.field_78116_cChild_2.addBox(2.5F, -3.0F, -9.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(field_78116_cChild_2, 0.2617993950843811F, 0.0F, 0.0F);
        this.field_78124_i = new ModelRenderer(this, 40, 28);
        this.field_78124_i.mirror = true;
        this.field_78124_i.setRotationPoint(3.200000047683716F, 8.0F, 0.10000000149011612F);
        this.field_78124_i.addBox(-3.0F, 0.0F, -3.0F, 6, 16, 6, 0.0F);
        this.field_78121_j = new ModelRenderer(this, 24, 0);
        this.field_78121_j.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78121_j.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.field_78112_f = new ModelRenderer(this, 20, 50);
        this.field_78112_f.setRotationPoint(-8.5F, -6.0F, 0.0F);
        this.field_78112_f.addBox(-5.0F, -2.0F, -3.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(field_78112_f, 0.0F, 0.0F, 0.10000000149011613F);
        this.field_78112_fChild = new ModelRenderer(this, 0, 49);
        this.field_78112_fChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78112_fChild.addBox(-4.5F, 6.0F, -2.5F, 5, 10, 5, 0.0F);
        this.field_78115_e = new ModelRenderer(this, 0, 20);
        this.field_78115_e.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.field_78115_e.addBox(-6.0F, 0.0F, -4.0F, 12, 16, 8, 0.0F);
        this.field_78123_h = new ModelRenderer(this, 40, 28);
        this.field_78123_h.setRotationPoint(-3.200000047683716F, 8.0F, 0.10000000149011612F);
        this.field_78123_h.addBox(-3.0F, 0.0F, -3.0F, 6, 16, 6, 0.0F);
        this.field_78113_gChild_1 = new ModelRenderer(this, 0, 49);
        this.field_78113_gChild_1.mirror = true;
        this.field_78113_gChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78113_gChild_1.addBox(-0.5F, 6.0F, -2.5F, 5, 10, 5, 0.0F);
        this.field_78114_d = new ModelRenderer(this, 32, 0);
        this.field_78114_d.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.field_78114_d.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.field_78116_c.addChild(this.field_78116_cChild);
        this.field_78113_g.addChild(this.field_78113_gChild);
        this.field_78112_f.addChild(this.field_78112_fChild_1);
        this.field_78116_c.addChild(this.field_78116_cChild_1);
        this.field_78116_c.addChild(this.field_78116_cChild_2);
        this.field_78112_f.addChild(this.field_78112_fChild);
        this.field_78113_g.addChild(this.field_78113_gChild_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78116_c.render(f5);
        this.field_78113_g.render(f5);
        this.field_78124_i.render(f5);
        this.field_78121_j.render(f5);
        this.field_78112_f.render(f5);
        this.field_78115_e.render(f5);
        this.field_78123_h.render(f5);
        this.field_78114_d.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
