package .minecraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * WFMModelLizardmenSaurus - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class WFMModelLizardmenSaurus extends ModelBase {
    public ModelRenderer field_78114_d;
    public ModelRenderer field_78124_i;
    public ModelRenderer field_78116_c;
    public ModelRenderer field_78115_e;
    public ModelRenderer field_78123_h;
    public ModelRenderer field_78121_j;
    public ModelRenderer field_78124_iChild;
    public ModelRenderer field_78124_iChildChild;
    public ModelRenderer field_78124_iChildChildChild;
    public ModelRenderer field_78116_cChild;
    public ModelRenderer field_78116_cChild_1;
    public ModelRenderer field_78116_cChild_2;
    public ModelRenderer field_78116_cChild_3;
    public ModelRenderer field_78115_eChild;
    public ModelRenderer field_78115_eChild_1;
    public ModelRenderer field_78115_eChild_2;
    public ModelRenderer field_78115_eChildChild;
    public ModelRenderer field_78115_eChildChild_1;
    public ModelRenderer field_78115_eChildChild_2;
    public ModelRenderer field_78115_eChildChild_3;
    public ModelRenderer field_78123_hChild;
    public ModelRenderer field_78123_hChildChild;
    public ModelRenderer field_78123_hChildChildChild;

    public WFMModelLizardmenSaurus() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78123_hChildChild = new ModelRenderer(this, 46, 229);
        this.field_78123_hChildChild.setRotationPoint(0.5F, 6.0F, 3.0F);
        this.field_78123_hChildChild.addBox(-0.699999988079071F, 0.30000001192092896F, 4.0F, 6, 13, 5, 0.0F);
        this.setRotateAngle(field_78123_hChildChild, -1.639038681983948F, 0.0F, 0.0F);
        this.field_78124_iChild = new ModelRenderer(this, 46, 131);
        this.field_78124_iChild.mirror = true;
        this.field_78124_iChild.setRotationPoint(0.10000000149011612F, 12.399999618530273F, -2.4000000953674316F);
        this.field_78124_iChild.addBox(0.0F, 0.0F, 0.0F, 6, 14, 6, 0.0F);
        this.setRotateAngle(field_78124_iChild, 1.639038681983948F, 0.0F, 0.0F);
        this.field_78116_cChild_1 = new ModelRenderer(this, 75, 46);
        this.field_78116_cChild_1.setRotationPoint(-3.5F, 11.0F, -19.0F);
        this.field_78116_cChild_1.addBox(0.0F, -5.699999809265137F, -5.400000095367432F, 6, 2, 8, 0.0F);
        this.setRotateAngle(field_78116_cChild_1, 0.31869712471961975F, 0.0F, 0.0F);
        this.field_78115_e = new ModelRenderer(this, 0, 38);
        this.field_78115_e.setRotationPoint(0.0F, 7.0F, 0.8999999761581421F);
        this.field_78115_e.addBox(-7.0F, -33.0F, -6.300000190734863F, 14, 28, 10, 0.5F);
        this.setRotateAngle(field_78115_e, 0.1820378452539444F, 0.0F, 0.0F);
        this.field_78123_h = new ModelRenderer(this, 45, 182);
        this.field_78123_h.setRotationPoint(-6.0F, -1.0F, 3.0F);
        this.field_78123_h.addBox(-7.0F, -2.0F, -4.0F, 6, 14, 8, 0.5F);
        this.setRotateAngle(field_78123_h, -0.43633231520652765F, 0.0F, 0.0F);
        this.field_78115_eChild_1 = new ModelRenderer(this, 89, 191);
        this.field_78115_eChild_1.setRotationPoint(0.0F, -6.0F, -4.0F);
        this.field_78115_eChild_1.addBox(-3.5F, -5.900000095367432F, 4.199999809265137F, 6, 9, 10, 0.0F);
        this.setRotateAngle(field_78115_eChild_1, -0.1820378452539444F, 0.0F, 0.0F);
        this.field_78114_d = new ModelRenderer(this, 32, 0);
        this.field_78114_d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78114_d.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.field_78115_eChildChild_3 = new ModelRenderer(this, 95, 129);
        this.field_78115_eChildChild_3.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.field_78115_eChildChild_3.addBox(-6.5F, 6.0F, -3.0F, 6, 18, 6, 0.0F);
        this.field_78123_hChildChildChild = new ModelRenderer(this, 0, 243);
        this.field_78123_hChildChildChild.setRotationPoint(5.800000190734863F, -7.599999904632568F, -5.300000190734863F);
        this.field_78123_hChildChildChild.addBox(-7.0F, 22.0F, -6.0F, 7, 3, 9, 0.0F);
        this.setRotateAngle(field_78123_hChildChildChild, 0.43633231520652765F, 0.0F, 0.0F);
        this.field_78116_cChild = new ModelRenderer(this, 0, 0);
        this.field_78116_cChild.setRotationPoint(-4.5F, 2.0F, -2.0F);
        this.field_78116_cChild.addBox(0.0F, -3.5F, -6.099999904632568F, 8, 10, 7, 0.0F);
        this.field_78124_iChildChild = new ModelRenderer(this, 46, 161);
        this.field_78124_iChildChild.mirror = true;
        this.field_78124_iChildChild.setRotationPoint(5.599999904632568F, 6.0F, 3.0F);
        this.field_78124_iChildChild.addBox(-5.5F, 0.30000001192092896F, 4.0F, 6, 13, 5, 0.0F);
        this.setRotateAngle(field_78124_iChildChild, -1.639038681983948F, 0.0F, 0.0F);
        this.field_78124_iChildChildChild = new ModelRenderer(this, 0, 243);
        this.field_78124_iChildChildChild.mirror = true;
        this.field_78124_iChildChildChild.setRotationPoint(-5.800000190734863F, -7.599999904632568F, -5.300000190734863F);
        this.field_78124_iChildChildChild.addBox(0.0F, 22.0F, -6.0F, 7, 3, 9, 0.0F);
        this.setRotateAngle(field_78124_iChildChildChild, 0.43633231520652765F, 0.0F, 0.0F);
        this.field_78115_eChild_2 = new ModelRenderer(this, 88, 174);
        this.field_78115_eChild_2.setRotationPoint(-11.0F, -30.0F, -1.0F);
        this.field_78115_eChild_2.addBox(-8.0F, -2.0F, -4.0F, 12, 8, 8, 0.0F);
        this.field_78123_hChild = new ModelRenderer(this, 46, 206);
        this.field_78123_hChild.mirror = true;
        this.field_78123_hChild.setRotationPoint(-7.0F, 12.399999618530273F, -2.4000000953674316F);
        this.field_78123_hChild.addBox(0.0F, 0.0F, 0.0F, 6, 14, 6, 0.0F);
        this.setRotateAngle(field_78123_hChild, 1.639038681983948F, 0.0F, 0.0F);
        this.field_78115_eChildChild = new ModelRenderer(this, 95, 101);
        this.field_78115_eChildChild.mirror = true;
        this.field_78115_eChildChild.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.field_78115_eChildChild.addBox(0.5F, 6.0F, -3.0F, 6, 18, 6, 0.0F);
        this.field_78121_j = new ModelRenderer(this, 24, 0);
        this.field_78121_j.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78121_j.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.field_78116_c = new ModelRenderer(this, 76, 0);
        this.field_78116_c.setRotationPoint(1.0F, -22.600000381469727F, -8.0F);
        this.field_78116_c.addBox(-5.5F, -4.0F, -18.600000381469727F, 10, 10, 12, 0.5F);
        this.setRotateAngle(field_78116_c, 0.08726646006107329F, 0.0F, 0.0F);
        this.field_78115_eChild = new ModelRenderer(this, 88, 156);
        this.field_78115_eChild.setRotationPoint(9.0F, -30.0F, -1.0F);
        this.field_78115_eChild.addBox(-2.0F, -2.0F, -4.0F, 12, 8, 8, 0.0F);
        this.setRotateAngle(field_78115_eChild, 0.0F, 0.0F, -0.10000000149011613F);
        this.field_78124_i = new ModelRenderer(this, 45, 101);
        this.field_78124_i.mirror = true;
        this.field_78124_i.setRotationPoint(7.0F, -1.399999976158142F, 3.4000000953674316F);
        this.field_78124_i.addBox(0.0F, -2.0F, -4.0F, 6, 14, 8, 0.5F);
        this.setRotateAngle(field_78124_i, -0.43633231520652765F, 0.0F, 0.0F);
        this.field_78116_cChild_3 = new ModelRenderer(this, 75, 27);
        this.field_78116_cChild_3.setRotationPoint(0.5F, -0.4000000059604645F, -8.5F);
        this.field_78116_cChild_3.addBox(-5.0F, -4.699999809265137F, -20.600000381469727F, 8, 6, 12, 0.0F);
        this.setRotateAngle(field_78116_cChild_3, 0.13665927946567535F, 0.0F, 0.0F);
        this.field_78115_eChildChild_2 = new ModelRenderer(this, 87, 211);
        this.field_78115_eChildChild_2.setRotationPoint(0.0F, -3.4000000953674316F, 3.0F);
        this.field_78115_eChildChild_2.addBox(-3.0F, -2.5F, 11.0F, 5, 7, 14, 0.0F);
        this.setRotateAngle(field_78115_eChildChild_2, -0.09110618382692338F, 0.0F, 0.0F);
        this.field_78116_cChild_2 = new ModelRenderer(this, 1, 77);
        this.field_78116_cChild_2.setRotationPoint(-10.300000190734863F, -3.5999999046325684F, -3.0F);
        this.field_78116_cChild_2.addBox(0.0F, 0.0F, -5.0F, 14, 14, 1, 0.0F);
        this.setRotateAngle(field_78116_cChild_2, -0.7939502596855165F, -0.6059783101081848F, -0.5089380145072937F);
        this.field_78115_eChildChild_1 = new ModelRenderer(this, 85, 233);
        this.field_78115_eChildChild_1.setRotationPoint(0.10000000149011612F, -3.799999952316284F, 3.0F);
        this.field_78115_eChildChild_1.addBox(-2.0F, -2.0F, 24.0F, 2, 4, 18, 0.0F);
        this.setRotateAngle(field_78115_eChildChild_1, -0.1820378452539444F, 0.0F, 0.0F);
        this.field_78123_hChild.addChild(this.field_78123_hChildChild);
        this.field_78124_i.addChild(this.field_78124_iChild);
        this.field_78116_c.addChild(this.field_78116_cChild_1);
        this.field_78115_e.addChild(this.field_78115_eChild_1);
        this.field_78115_eChild_2.addChild(this.field_78115_eChildChild_3);
        this.field_78123_hChildChild.addChild(this.field_78123_hChildChildChild);
        this.field_78116_c.addChild(this.field_78116_cChild);
        this.field_78124_iChild.addChild(this.field_78124_iChildChild);
        this.field_78124_iChildChild.addChild(this.field_78124_iChildChildChild);
        this.field_78115_e.addChild(this.field_78115_eChild_2);
        this.field_78123_h.addChild(this.field_78123_hChild);
        this.field_78115_eChild.addChild(this.field_78115_eChildChild);
        this.field_78115_e.addChild(this.field_78115_eChild);
        this.field_78116_c.addChild(this.field_78116_cChild_3);
        this.field_78115_eChild_1.addChild(this.field_78115_eChildChild_2);
        this.field_78116_c.addChild(this.field_78116_cChild_2);
        this.field_78115_eChild_1.addChild(this.field_78115_eChildChild_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78115_e.render(f5);
        this.field_78123_h.render(f5);
        this.field_78114_d.render(f5);
        this.field_78121_j.render(f5);
        this.field_78116_c.render(f5);
        this.field_78124_i.render(f5);
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
