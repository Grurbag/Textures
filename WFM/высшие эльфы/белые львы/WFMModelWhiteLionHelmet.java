// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer dragon;
	private final ModelRenderer nose_1;
	private final ModelRenderer nose_2;
	private final ModelRenderer helmet_1;
	private final ModelRenderer helmet_2;
	private final ModelRenderer nose_3;
	private final ModelRenderer helmet_3;
	private final ModelRenderer nose_4;
	private final ModelRenderer nose_5;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		dragon = new ModelRenderer(this);
		dragon.setRotationPoint(-2.5F, -11.0F, -3.5F);
		helmet.addChild(dragon);
		dragon.cubeList.add(new ModelBox(dragon, 38, -11, 2.5F, -11.0F, 1.0F, 0, 15, 11, 0.0F, false));

		nose_1 = new ModelRenderer(this);
		nose_1.setRotationPoint(-1.0F, -7.2F, -4.5F);
		helmet.addChild(nose_1);
		nose_1.cubeList.add(new ModelBox(nose_1, 32, 21, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		nose_2 = new ModelRenderer(this);
		nose_2.setRotationPoint(-0.5F, -6.2F, -4.6F);
		helmet.addChild(nose_2);
		nose_2.cubeList.add(new ModelBox(nose_2, 32, 23, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		helmet_1 = new ModelRenderer(this);
		helmet_1.setRotationPoint(-3.5F, -10.0F, -3.5F);
		helmet.addChild(helmet_1);
		helmet_1.cubeList.add(new ModelBox(helmet_1, 0, 16, 0.0F, 0.0F, 0.0F, 7, 2, 7, 0.0F, false));

		helmet_2 = new ModelRenderer(this);
		helmet_2.setRotationPoint(-3.0F, -11.0F, -3.0F);
		helmet.addChild(helmet_2);
		helmet_2.cubeList.add(new ModelBox(helmet_2, 0, 25, 0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F, false));

		nose_3 = new ModelRenderer(this);
		nose_3.setRotationPoint(-0.5F, -12.8F, -3.0F);
		helmet.addChild(nose_3);
		setRotationAngle(nose_3, -0.2618F, 0.0F, 0.0F);
		nose_3.cubeList.add(new ModelBox(nose_3, 32, 12, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		helmet_3 = new ModelRenderer(this);
		helmet_3.setRotationPoint(-2.5F, -12.0F, -2.5F);
		helmet.addChild(helmet_3);
		helmet_3.cubeList.add(new ModelBox(helmet_3, 24, 26, 0.0F, 0.0F, 0.0F, 5, 1, 5, 0.0F, false));

		nose_4 = new ModelRenderer(this);
		nose_4.setRotationPoint(-1.0F, -11.9F, -3.3F);
		helmet.addChild(nose_4);
		setRotationAngle(nose_4, -0.2094F, 0.0F, 0.0F);
		nose_4.cubeList.add(new ModelBox(nose_4, 32, 14, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		nose_5 = new ModelRenderer(this);
		nose_5.setRotationPoint(-1.5F, -11.0F, -3.7F);
		helmet.addChild(nose_5);
		setRotationAngle(nose_5, -0.2094F, 0.0F, 0.0F);
		nose_5.cubeList.add(new ModelBox(nose_5, 32, 16, 0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}