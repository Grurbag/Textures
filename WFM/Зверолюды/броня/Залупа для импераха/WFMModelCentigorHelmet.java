// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer horn_right_bot;
	private final ModelRenderer horn_right_bot2;
	private final ModelRenderer horn_right_bot3;
	private final ModelRenderer horn_left_bot;
	private final ModelRenderer horn_left_bot2;
	private final ModelRenderer horn_left_bot3;
	private final ModelRenderer horn_left_top;
	private final ModelRenderer horn_left_top2;
	private final ModelRenderer horn_left_top3;
	private final ModelRenderer horn_right_top;
	private final ModelRenderer horn_right_top1;
	private final ModelRenderer horn_right_top2;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, -8.0F, -9.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		horn_right_bot = new ModelRenderer(this);
		horn_right_bot.setRotationPoint(6.0F, -2.0F, -1.0F);
		helmet.addChild(horn_right_bot);
		setRotationAngle(horn_right_bot, 0.1275F, 0.5533F, 0.257F);
		horn_right_bot.cubeList.add(new ModelBox(horn_right_bot, 48, 0, -4.0F, -3.0F, -1.5F, 5, 3, 3, 0.0F, false));

		horn_right_bot2 = new ModelRenderer(this);
		horn_right_bot2.setRotationPoint(2.0F, 0.0F, 1.0F);
		horn_right_bot.addChild(horn_right_bot2);
		setRotationAngle(horn_right_bot2, 0.0F, -2.7489F, 0.0F);
		horn_right_bot2.cubeList.add(new ModelBox(horn_right_bot2, 50, 7, -4.0F, -2.5F, 0.5F, 5, 2, 2, 0.0F, false));

		horn_right_bot3 = new ModelRenderer(this);
		horn_right_bot3.setRotationPoint(-6.0F, 1.0F, 1.0F);
		horn_right_bot2.addChild(horn_right_bot3);
		setRotationAngle(horn_right_bot3, 0.0F, 0.7854F, 0.0F);
		horn_right_bot3.cubeList.add(new ModelBox(horn_right_bot3, 50, 12, -3.0F, -3.0F, 2.0F, 5, 1, 1, 0.0F, false));

		horn_left_bot = new ModelRenderer(this);
		horn_left_bot.setRotationPoint(-3.0F, -3.0F, 0.0F);
		helmet.addChild(horn_left_bot);
		setRotationAngle(horn_left_bot, 0.1243F, -0.51F, -0.2506F);
		horn_left_bot.cubeList.add(new ModelBox(horn_left_bot, 48, 0, -4.0F, -3.0F, -1.5F, 5, 3, 3, 0.0F, false));

		horn_left_bot2 = new ModelRenderer(this);
		horn_left_bot2.setRotationPoint(-3.0F, 0.0F, -2.0F);
		horn_left_bot.addChild(horn_left_bot2);
		setRotationAngle(horn_left_bot2, 0.0F, -0.5672F, 0.0F);
		horn_left_bot2.cubeList.add(new ModelBox(horn_left_bot2, 50, 7, -4.0F, -2.5F, 1.0F, 5, 2, 2, 0.0F, false));

		horn_left_bot3 = new ModelRenderer(this);
		horn_left_bot3.setRotationPoint(-2.0F, 1.0F, 0.0F);
		horn_left_bot2.addChild(horn_left_bot3);
		setRotationAngle(horn_left_bot3, 0.0F, -0.7854F, 0.0F);
		horn_left_bot3.cubeList.add(new ModelBox(horn_left_bot3, 50, 12, -4.0F, -3.0F, 2.0F, 5, 1, 1, 0.0F, false));

		horn_left_top = new ModelRenderer(this);
		horn_left_top.setRotationPoint(-1.0F, -8.0F, 0.0F);
		helmet.addChild(horn_left_top);
		setRotationAngle(horn_left_top, 3.0009F, 0.3678F, 1.1955F);
		horn_left_top.cubeList.add(new ModelBox(horn_left_top, 48, 0, -4.0F, -3.0F, -1.5F, 5, 3, 3, 0.0F, false));

		horn_left_top2 = new ModelRenderer(this);
		horn_left_top2.setRotationPoint(-3.0F, 0.0F, -2.0F);
		horn_left_top.addChild(horn_left_top2);
		setRotationAngle(horn_left_top2, 0.0F, -0.5672F, 0.0F);
		horn_left_top2.cubeList.add(new ModelBox(horn_left_top2, 50, 7, -4.0F, -2.5F, 1.0F, 5, 2, 2, 0.0F, false));

		horn_left_top3 = new ModelRenderer(this);
		horn_left_top3.setRotationPoint(-2.0F, 1.0F, 0.0F);
		horn_left_top2.addChild(horn_left_top3);
		setRotationAngle(horn_left_top3, 0.0F, -0.7854F, 0.0F);
		horn_left_top3.cubeList.add(new ModelBox(horn_left_top3, 50, 12, -4.0F, -3.0F, 2.0F, 5, 1, 1, 0.0F, false));

		horn_right_top = new ModelRenderer(this);
		horn_right_top.setRotationPoint(4.0F, -7.0F, 0.0F);
		helmet.addChild(horn_right_top);
		setRotationAngle(horn_right_top, -2.9683F, 0.3542F, 2.0382F);
		horn_right_top.cubeList.add(new ModelBox(horn_right_top, 48, 0, -4.0F, -3.0F, -1.5F, 5, 3, 3, 0.0F, false));

		horn_right_top1 = new ModelRenderer(this);
		horn_right_top1.setRotationPoint(-3.0F, 0.0F, -2.0F);
		horn_right_top.addChild(horn_right_top1);
		setRotationAngle(horn_right_top1, 0.0F, -0.5672F, 0.0F);
		horn_right_top1.cubeList.add(new ModelBox(horn_right_top1, 50, 7, -4.0F, -2.5F, 1.0F, 5, 2, 2, 0.0F, false));

		horn_right_top2 = new ModelRenderer(this);
		horn_right_top2.setRotationPoint(-2.0F, 1.0F, 0.0F);
		horn_right_top1.addChild(horn_right_top2);
		setRotationAngle(horn_right_top2, 0.0F, -0.7854F, 0.0F);
		horn_right_top2.cubeList.add(new ModelBox(horn_right_top2, 50, 12, -4.0F, -3.0F, 2.0F, 5, 1, 1, 0.0F, false));
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