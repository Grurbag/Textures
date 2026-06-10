package .minecraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * WFMModelTroll - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class WFMModelTroll extends ModelBase {
    public ModelRenderer field_78114_d;
    public ModelRenderer field_78112_f;
    public ModelRenderer field_78124_i;
    public ModelRenderer field_78116_c;
    public ModelRenderer field_78115_e;
    public ModelRenderer field_78113_g;
    public ModelRenderer field_78123_h;
    public ModelRenderer field_78121_j;
    public ModelRenderer field_78112_fChild;
    public ModelRenderer field_78112_fChildChild;
    public ModelRenderer field_78124_iChild;
    public ModelRenderer field_78124_iChildChild;
    public ModelRenderer field_78116_cChild;
    public ModelRenderer field_78116_cChild_1;
    public ModelRenderer field_78116_cChild_2;
    public ModelRenderer field_78116_cChild_3;
    public ModelRenderer field_78116_cChildChild;
    public ModelRenderer field_78116_cChildChild_1;
    public ModelRenderer field_78113_gChild;
    public ModelRenderer field_78113_gChildChild;
    public ModelRenderer field_78123_hChild;
    public ModelRenderer field_78123_hChildChild;

    public WFMModelTroll() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78124_i = new ModelRenderer(this, 0, 16);
        this.field_78124_i.setRotationPoint(2.5F, 13.5F, 0.10000000149011612F);
        this.field_78124_i.addBox(-2.0F, -0.800000011920929F, -2.299999952316284F, 5, 7, 4, -8.940696716308594E-8F);
        this.field_78121_j = new ModelRenderer(this, 24, 0);
        this.field_78121_j.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78121_j.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.field_78113_gChildChild = new ModelRenderer(this, 50, 41);
        this.field_78113_gChildChild.setRotationPoint(0.5F, 6.0F, 0.0F);
        this.field_78113_gChildChild.addBox(-2.0F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(field_78113_gChildChild, -0.17453292012214658F, 0.0F, 0.0F);
        this.field_78123_hChildChild = new ModelRenderer(this, 0, 39);
        this.field_78123_hChildChild.setRotationPoint(-2.0999999046325684F, 3.700000047683716F, -5.0F);
        this.field_78123_hChildChild.addBox(0.0F, 0.0F, 0.0F, 5, 3, 6, 0.0F);
        this.field_78116_cChild_2 = new ModelRenderer(this, 22, 0);
        this.field_78116_cChild_2.setRotationPoint(-8.0F, -3.5F, -3.0F);
        this.field_78116_cChild_2.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(field_78116_cChild_2, 0.08726646006107329F, 0.2617993950843811F, 0.2617993950843811F);
        this.field_78113_g = new ModelRenderer(this, 50, 17);
        this.field_78113_g.setRotationPoint(3.5F, -2.0F, -1.100000023841858F);
        this.field_78113_g.addBox(-2.0F, 0.0F, -2.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(field_78113_g, 0.0F, 0.0F, -0.08726646006107329F);
        this.field_78116_cChild_3 = new ModelRenderer(this, 22, 0);
        this.field_78116_cChild_3.setRotationPoint(4.5F, -2.5F, -4.0F);
        this.field_78116_cChild_3.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(field_78116_cChild_3, 0.08726646006107329F, -0.2617993950843811F, -0.2617993950843811F);
        this.field_78123_hChild = new ModelRenderer(this, 0, 27);
        this.field_78123_hChild.mirror = true;
        this.field_78123_hChild.setRotationPoint(0.0F, 3.799999952316284F, 1.0F);
        this.field_78123_hChild.addBox(-2.0F, -0.800000011920929F, -2.299999952316284F, 5, 8, 4, 0.0F);
        this.field_78124_iChild = new ModelRenderer(this, 0, 27);
        this.field_78124_iChild.mirror = true;
        this.field_78124_iChild.setRotationPoint(0.0F, 3.799999952316284F, 1.0F);
        this.field_78124_iChild.addBox(-2.0F, -0.800000011920929F, -2.299999952316284F, 5, 8, 4, 0.0F);
        this.field_78116_cChildChild_1 = new ModelRenderer(this, 32, 0);
        this.field_78116_cChildChild_1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.field_78116_cChildChild_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.field_78124_iChildChild = new ModelRenderer(this, 0, 39);
        this.field_78124_iChildChild.setRotationPoint(-1.899999976158142F, 3.700000047683716F, -5.0F);
        this.field_78124_iChildChild.addBox(0.0F, 0.0F, 0.0F, 5, 3, 6, 0.0F);
        this.field_78116_cChildChild = new ModelRenderer(this, 32, 0);
        this.field_78116_cChildChild.setRotationPoint(8.0F, -2.0F, 0.0F);
        this.field_78116_cChildChild.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.field_78123_h = new ModelRenderer(this, 0, 16);
        this.field_78123_h.setRotationPoint(-3.5F, 13.5F, 0.10000000149011612F);
        this.field_78123_h.addBox(-2.0F, -0.800000011920929F, -2.299999952316284F, 5, 7, 4, -8.940696716308594E-8F);
        this.field_78116_cChild_1 = new ModelRenderer(this, 28, 0);
        this.field_78116_cChild_1.setRotationPoint(-4.5F, 4.599999904632568F, -11.0F);
        this.field_78116_cChild_1.addBox(0.0F, 0.0F, 0.0F, 9, 3, 10, 0.0F);
        this.setRotateAngle(field_78116_cChild_1, 0.17453292012214658F, 0.0F, 0.0F);
        this.field_78114_d = new ModelRenderer(this, 32, 0);
        this.field_78114_d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78114_d.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.field_78116_c = new ModelRenderer(this, 71, 0);
        this.field_78116_c.setRotationPoint(0.0F, -1.5F, -2.5F);
        this.field_78116_c.addBox(-5.0F, -5.0F, -8.0F, 10, 10, 10, 0.0F);
        this.field_78115_e = new ModelRenderer(this, 18, 16);
        this.field_78115_e.setRotationPoint(-1.0F, -2.0F, -1.0F);
        this.field_78115_e.addBox(-4.0F, 0.0F, -2.0F, 10, 16, 6, 0.0F);
        this.field_78112_fChild = new ModelRenderer(this, 50, 29);
        this.field_78112_fChild.setRotationPoint(-3.5F, 3.5F, -1.0F);
        this.field_78112_fChild.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.field_78112_fChildChild = new ModelRenderer(this, 50, 41);
        this.field_78112_fChildChild.setRotationPoint(0.5F, 6.0F, 0.0F);
        this.field_78112_fChildChild.addBox(0.0F, 0.0F, 0.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(field_78112_fChildChild, -0.17453292012214658F, 0.0F, 0.0F);
        this.field_78113_gChild = new ModelRenderer(this, 50, 29);
        this.field_78113_gChild.setRotationPoint(1.5F, 3.5F, 1.0F);
        this.field_78113_gChild.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.field_78116_cChild = new ModelRenderer(this, 0, 0);
        this.field_78116_cChild.setRotationPoint(-1.5F, -3.0F, -9.0F);
        this.field_78116_cChild.addBox(0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
        this.field_78112_f = new ModelRenderer(this, 50, 17);
        this.field_78112_f.setRotationPoint(-5.5F, -2.0F, -1.100000023841858F);
        this.field_78112_f.addBox(-4.0F, 0.0F, -2.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(field_78112_f, 0.0F, 0.0F, 0.08726646006107329F);
        this.field_78113_gChild.addChild(this.field_78113_gChildChild);
        this.field_78123_hChild.addChild(this.field_78123_hChildChild);
        this.field_78116_c.addChild(this.field_78116_cChild_2);
        this.field_78116_c.addChild(this.field_78116_cChild_3);
        this.field_78123_h.addChild(this.field_78123_hChild);
        this.field_78124_i.addChild(this.field_78124_iChild);
        this.field_78116_cChild_1.addChild(this.field_78116_cChildChild_1);
        this.field_78124_iChild.addChild(this.field_78124_iChildChild);
        this.field_78116_cChild_1.addChild(this.field_78116_cChildChild);
        this.field_78116_c.addChild(this.field_78116_cChild_1);
        this.field_78112_f.addChild(this.field_78112_fChild);
        this.field_78112_fChild.addChild(this.field_78112_fChildChild);
        this.field_78113_g.addChild(this.field_78113_gChild);
        this.field_78116_c.addChild(this.field_78116_cChild);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78124_i.render(f5);
        this.field_78121_j.render(f5);
        this.field_78113_g.render(f5);
        this.field_78123_h.render(f5);
        this.field_78114_d.render(f5);
        this.field_78116_c.render(f5);
        this.field_78115_e.render(f5);
        this.field_78112_f.render(f5);
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
