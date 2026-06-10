// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfThane extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer wing_left;
	private final ModelRenderer wing_left_r1;
	private final ModelRenderer wing_right;
	private final ModelRenderer wing_right_r1;
	private final ModelRenderer helmet_1;
	private final ModelRenderer helmet_2;
	private final ModelRenderer helmet_overlay;

	public WFMModelDwarfThane() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		wing_left = new ModelRenderer(this);
		wing_left.setRotationPoint(-5.0F, -1.0F, 0.0F);
		helmet.addChild(wing_left);
		

		wing_left_r1 = new ModelRenderer(this);
		wing_left_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		wing_left.addChild(wing_left_r1);
		setRotationAngle(wing_left_r1, 0.0F, -0.0873F, 0.0F);
		wing_left_r1.cubeList.add(new ModelBox(wing_left_r1, 0, -14, 0.5F, -23.0F, -1.0F, 0, 19, 14, 0.0F, false));

		wing_right = new ModelRenderer(this);
		wing_right.setRotationPoint(3.0F, -1.0F, 0.0F);
		helmet.addChild(wing_right);
		setRotationAngle(wing_right, 0.0F, 0.1745F, 0.0F);
		

		wing_right_r1 = new ModelRenderer(this);
		wing_right_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		wing_right.addChild(wing_right_r1);
		setRotationAngle(wing_right_r1, 0.0F, -0.0873F, 0.0F);
		wing_right_r1.cubeList.add(new ModelBox(wing_right_r1, 0, -14, 1.5F, -23.0F, -1.0F, 0, 19, 14, 0.0F, false));

		helmet_1 = new ModelRenderer(this);
		helmet_1.setRotationPoint(0.0F, 0.0F, -4.0F);
		helmet.addChild(helmet_1);
		setRotationAngle(helmet_1, -0.2618F, 0.0F, 0.0F);
		helmet_1.cubeList.add(new ModelBox(helmet_1, 0, 21, -1.0F, -13.0F, -1.0F, 2, 5, 2, 0.0F, false));

		helmet_2 = new ModelRenderer(this);
		helmet_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmet_2);
		helmet_2.cubeList.add(new ModelBox(helmet_2, 8, 19, -1.0F, -14.0F, -4.0F, 2, 2, 5, 0.0F, false));

		helmet_overlay = new ModelRenderer(this);
		helmet_overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet_overlay.cubeList.add(new ModelBox(helmet_overlay, 32, 16, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
		helmet_overlay.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}