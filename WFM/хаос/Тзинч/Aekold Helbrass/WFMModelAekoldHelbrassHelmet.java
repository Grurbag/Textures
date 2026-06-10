// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelAekoldHelbrassHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer mask;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer helmet_1;
	private final ModelRenderer helmet_2;
	private final ModelRenderer horn_small_left;
	private final ModelRenderer horn_small_right;
	private final ModelRenderer helmet_3;
	private final ModelRenderer horn_small_top;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_right;

	public WFMModelAekoldHelbrassHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		mask = new ModelRenderer(this);
		mask.setRotationPoint(-1.0F, 0.0F, 0.0F);
		helmet.addChild(mask);
		mask.cubeList.add(new ModelBox(mask, 32, 28, -3.5F, -8.0F, -4.1F, 9, 8, 0, 0.5F, false));

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.cubeList.add(new ModelBox(helmetOverlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		helmet_1 = new ModelRenderer(this);
		helmet_1.setRotationPoint(0.0F, -8.0F, 0.0F);
		helmet.addChild(helmet_1);
		helmet_1.cubeList.add(new ModelBox(helmet_1, 0, 16, -4.0F, -4.0F, -4.0F, 8, 4, 8, 0.0F, false));

		helmet_2 = new ModelRenderer(this);
		helmet_2.setRotationPoint(0.0F, -4.0F, 0.0F);
		helmet_1.addChild(helmet_2);
		helmet_2.cubeList.add(new ModelBox(helmet_2, 0, 28, -3.0F, -3.0F, -3.0F, 6, 3, 6, 0.0F, false));

		horn_small_left = new ModelRenderer(this);
		horn_small_left.setRotationPoint(3.0F, -4.0F, 0.0F);
		helmet_2.addChild(horn_small_left);
		setRotationAngle(horn_small_left, 0.0F, 3.1416F, 0.0F);
		horn_small_left.cubeList.add(new ModelBox(horn_small_left, 0, 0, -1.0F, -1.0F, 0.0F, 2, 2, 0, 0.0F, false));

		horn_small_right = new ModelRenderer(this);
		horn_small_right.setRotationPoint(-3.0F, -3.0F, 0.0F);
		helmet_2.addChild(horn_small_right);
		horn_small_right.cubeList.add(new ModelBox(horn_small_right, 0, 0, -1.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));

		helmet_3 = new ModelRenderer(this);
		helmet_3.setRotationPoint(0.0F, -3.0F, 0.0F);
		helmet_2.addChild(helmet_3);
		helmet_3.cubeList.add(new ModelBox(helmet_3, 0, 37, -2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F, false));

		horn_small_top = new ModelRenderer(this);
		horn_small_top.setRotationPoint(0.0F, -3.0F, 0.0F);
		helmet_3.addChild(horn_small_top);
		horn_small_top.cubeList.add(new ModelBox(horn_small_top, 58, 0, -1.5F, -4.0F, 0.0F, 3, 4, 0, 0.0F, false));

		horn_left = new ModelRenderer(this);
		horn_left.setRotationPoint(5.0F, -5.0F, 0.0F);
		helmet.addChild(horn_left);
		horn_left.cubeList.add(new ModelBox(horn_left, 50, 17, -1.0F, -13.0F, 0.0F, 7, 15, 0, 0.0F, false));

		horn_right = new ModelRenderer(this);
		horn_right.setRotationPoint(-10.0F, -5.0F, 0.0F);
		helmet.addChild(horn_right);
		horn_right.cubeList.add(new ModelBox(horn_right, 50, 32, -1.0F, -13.0F, 0.0F, 7, 15, 0, 0.0F, false));
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